package edu.southwestern.tasks.interactive.picbreeder;

import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;

import edu.southwestern.MMNEAT.MMNEAT;
import edu.southwestern.evolution.genotypes.Genotype;
import edu.southwestern.networks.Network;
import edu.southwestern.parameters.Parameters;
import edu.southwestern.tasks.interactive.InteractiveEvolutionTask;
import edu.southwestern.util.graphics.GraphicsUtil;

/**
 * Implementation of picbreeder that extends InteractiveEvolutionTask
 * and uses Java Swing components for graphical interface
 * 
 * Original Picbreeder paper: 
 * Jimmy Secretan, Nicholas Beato, David B. D'Ambrosio, Adelein Rodriguez, Adam Campbell, 
 * Jeremiah T. Folsom-Kovarik and Kenneth O. Stanley. Picbreeder: A Case Study in Collaborative 
 * Evolutionary Exploration of Design Space. Evolutionary Computation 19, 3 (2011), 373-403. 
 * DOI: http://dx.doi.org/10.1162/evco_a_00030
 * 
 * @author Lauren Gillespie
 * @author Isabel Tweraser
 *
 * @param <T>
 */
public class PicbreederTask<T extends Network> extends InteractiveEvolutionTask<T> {

	public static final int CPPN_NUM_INPUTS	= 4;
	public static final int CPPN_NUM_OUTPUTS = 3;

	public PicbreederTask() throws IllegalAccessException {
		super();
	}

	@Override
	public String[] sensorLabels() {
		return new String[] { "X-coordinate", "Y-coordinate", "distance from center", "bias" };
	}

	@Override
	public String[] outputLabels() {
		return new String[] { "hue-value", "saturation-value", "brightness-value" };
	}

	@Override
	protected String getWindowTitle() {
		return "Picbreeder";
	}

	@Override
	protected BufferedImage getButtonImage(T phenotype, int width, int height, double[] inputMultipliers) {
		return GraphicsUtil.imageFromCPPN(phenotype, width, height, inputMultipliers);
	}

	@Override
	protected void additionalButtonClickAction(int scoreIndex, Genotype<T> individual) {
		// Do nothing
	}

	@Override
	protected void save(String filename, int i) {
		// Use of imageHeight and imageWidth allows saving a higher quality image than is on the button
		BufferedImage toSave = GraphicsUtil.imageFromCPPN((Network)scores.get(i).individual.getPhenotype(), Parameters.parameters.integerParameter("imageWidth"), Parameters.parameters.integerParameter("imageHeight"), inputMultipliers);
		BufferedImage toSaveReflected = GraphicsUtil.reflectHorizontal(toSave);
		filename += ".bmp";
		GraphicsUtil.saveImage(toSave, filename);
		String filename2 = filename+"2.bmp";
		GraphicsUtil.saveImage(toSaveReflected, filename2);
		
		System.out.println("image " + filename + " was saved successfully");
	}
	
	@Override
	protected void saveSingle(String filename, int i) {
		BufferedImage toSave1 = GraphicsUtil.imageFromCPPN((Network)scores.get(i).individual.getPhenotype(), 48, 48, inputMultipliers);
		String filename1 = filename + "1.bmp";
		GraphicsUtil.saveImage(toSave1, filename1);
		
		System.out.println("image " + filename1 + " was saved successfully");
	}
	
	@Override
	protected void saveWithReflections(String filename, int i) {
		// Use of imageHeight and imageWidth allows saving a higher quality image than is on the button
		BufferedImage toSave1 = GraphicsUtil.imageFromCPPN((Network)scores.get(i).individual.getPhenotype(), 48, 48, inputMultipliers);
		BufferedImage toSave2 = GraphicsUtil.reflectHorizontal(toSave1);
		BufferedImage toSave3 = GraphicsUtil.reflectVertical(toSave1);
		BufferedImage toSave4 = GraphicsUtil.reflectVertical(toSave2);
		String filename1 = filename + "1.bmp";
		GraphicsUtil.saveImage(toSave1, filename1);
		String filename2 = filename + "2.bmp";
		GraphicsUtil.saveImage(toSave2, filename2);
		String filename3 = filename + "3.bmp";
		GraphicsUtil.saveImage(toSave3, filename3);
		String filename4 = filename + "4.bmp";
		GraphicsUtil.saveImage(toSave4, filename4);
		
		System.out.println("image " + filename1 + " was saved successfully");
		System.out.println("image " + filename2 + " was saved successfully");
		System.out.println("image " + filename3 + " was saved successfully");
		System.out.println("image " + filename4 + " was saved successfully");
	}


	@Override
	public int numCPPNInputs() {
		return CPPN_NUM_INPUTS;
	}


	@Override
	public int numCPPNOutputs() {
		return CPPN_NUM_OUTPUTS;
	}

	/**
	 * For quick testing
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			MMNEAT.main(new String[]{"runNumber:0","randomSeed:1","trials:1","mu:16","maxGens:500","io:false","netio:false","mating:true","fs:false","task:edu.southwestern.tasks.interactive.picbreeder.PicbreederTask","allowMultipleFunctions:true","ftype:0","watch:false","netChangeActivationRate:0.3","cleanFrequency:-1","simplifiedInteractiveInterface:false","recurrency:false","saveAllChampions:true","cleanOldNetworks:false","ea:edu.southwestern.evolution.selectiveBreeding.SelectiveBreedingEA","imageWidth:2000","imageHeight:2000","imageSize:200","includeFullSigmoidFunction:true","includeFullGaussFunction:true","includeCosineFunction:true","includeGaussFunction:false","includeIdFunction:true","includeTriangleWaveFunction:false","includeSquareWaveFunction:false","includeFullSawtoothFunction:false","includeSigmoidFunction:false","includeAbsValFunction:false","includeSawtoothFunction:false" /*,"saveInteractiveSelections:true"*/});
		} catch (FileNotFoundException | NoSuchMethodException e) {
			e.printStackTrace();
		}
	}

	@Override
	protected String getFileType() {
		return "BMP Images";
	}

	@Override
	protected String getFileExtension() {
		return "bmp";
	}
}
