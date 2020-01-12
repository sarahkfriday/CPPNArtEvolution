# Quantum Zentanglement

This program makes computer generated Zentangles by first evolving images with a Compositional Pattern Producing Network then assembling chosen images into patterns using Wave Function Collapse. 

## How to make a Zentangle:
### Batch Files: 
* Launch-Zentangle-Interactive.bat : Evolve interactively using Picbreeder
* Launch-Zentangle-HB.bat : Automatically generate using the half-black fitness scheme
* Launch-Zentangle-HB3Color.bat : Automatically generate using the half-black-3-color fitness scheme
* Launch-Zentangle-RandomBW.bat : Automatically generate using the random fitness scheme in black-white only
* Launch-Zentangle-RandomColor.bat : Automatically generate using the random fitness scheme in color

### Windows 
* Double click on the Launch-Zentangle-Interactive.bat to create Zentangles interactively or choose any of the other 4 batch 		   files with the Launch prefix to automatically generate Zentangles using the fitness schemes random, half-black, half-black-3-color

### Mac/Linux/Unix 
* Run bash Launch-Zentangle-Interactive.bat from the terminal to create Zentangles interactively or choose any of the
  other 4 batch files with the Launch prefix to automatically generate Zentangles using the fitness schemes random, half-black,
  half-black-3-color

### Other
* Run PicbreederTask.java from the terminal or an IDE

### Interactive Evolution
* Evolve images until you find some that you think would make interesting patterns
* Toggle between mathematical functions and color settings such as stark and black-white
* Increase or decrease the mutation rate for more change between generations
* Select any number of images and press the Z (Zentangle) button! It may take take a few moments.
* Some of the images will be patterned using WFC and up to 2 will be used as template images
* The details of how a Zentangle is formed depend on how many images contribute to the Zentangle (see Zentangle Creation section)
* Your image will appear in a new window 

## Zentangle Creation

Images evolved from Picbreeder are randomly assigned roles as tiles or templates according to the table below.

Total Number of Images | Used for Templates | Used for Tiles | Additional Information
------------- | ------------- | ------------- | --------------------
2 | 1 | 1 |
3 | 1 | 2 |
4 | 2 | 3 | 1 of the images is used as both a template and pattern
5 | 2 | 3 |
6 - up | 1 | 5 - up | Multiple images are used in each pattern

Tile images are used as input to the Wave Function Collapse algorithm to make patterns. Below is an example of assembling a Zentangle from pattern and template images. 

![Tile 1](https://drive.google.com/uc?export=view&id=17GBwB70y718vyKnv6hdMYxOk73fPn0AB =200x200)
![Tile 2](https://drive.google.com/uc?export=view&id=12RQ0jh50RDuyD8mj9dFpUMNnTpZ6oNNY =200x200)

Tile 1 and Tile 2 are made into distinct pattern images. The patterns are then inserted into template image. Pattern 1 fills the black area of the template while Pattern 2 fills the non-black.

For this project, we have edited InteractiveEvolutionTask, which is implemented by a few other "tasks", such as breedesizer and animationbreeder. As a result, these tasks will also have a Zentangle button, but it will not function in those tasks.

Publication coming soon.

- Sarah Friday, Anna Krolikowski, Dr. Schrum, and Alice Quintanilla

# Below is the readme file that originally was included in CPPNArtEvolution  

This project contains several forms of interactive art evolution, all based on CPPNs. All code in this project is part of the main [MM-NEAT project](https://github.com/schrum2/MM-NEAT), but this project is simplified to remove much extraneous code not required for interactive evolution. This project is also much easier to use and launch. Just follow the instructions below:

## Windows

Just double-click any of the batch files with the Launch prefix:

* Launch-Picbreeder.bat: Evolve 2D pictures, just like the original [Picbreeder](http://picbreeder.org/)
* Launch-AnimationBreeder.bat: Evolve 2D animations!
* Launch-3DObjectBreeder.bat: Evolve 3D shapes, in a manner similar to [Endless Forms](http://endlessforms.com/)
* Launch-3DAnimationBreeder.bat: Evolve 3D animations!
* Launch-Breedesizer.bat: Evolve tones that can be used to play MIDI files, similar to the original [Breedesizer](http://bthj.is/breedesizer/)

These batch files all use the CPPNArtEvolution.jar file that is already in the repository. However, if you want to recompile this jar file, you can use the build.xml ANT build script, or create an executable jar file with the class edu.southwestern.MMNEAT.MMNEAT as the main class.

## Mac/Linux/Unix

The batch files listed above do not use any Windows-specific commands, so they can easily be executed as bash scripts as well. Alternately, you can just copy-paste the command inside of any of these files to your terminal.

## Help

If you need any help, then please contact me at schrum2@southwestern.edu!

Also, you can evolve neural networks for lots of other interesting applications by using the original [MM-NEAT project](https://github.com/schrum2/MM-NEAT), which contains the interactive evolution code from this project, along with code to evolve agent behavior for various tasks (Ms. Pac-Man, Tetris, and Mario to name a few)

## Citing

If you use any of this code for any project or publication, please cite the following paper:

```
@inproceedings{tweraser:gecco2018,
	title={Querying Across Time to Interactively Evolve Animations},
	author={Tweraser, Isabel and Gillespie, Lauren E and Schrum, Jacob},
	year={2018},
	booktitle={Proceedings of the Genetic and Evolutionary Computation Conference (GECCO 2018)},
	month={July},
	numpages = {8},
	url = {https://people.southwestern.edu/~schrum2/SCOPE/tweraser.gecco18.pdf},
	doi = {10.1145/3205455.3205460},
	publisher = {ACM},
	address = {New York, NY, USA},
	location={Kyoto, Japan}
}

```
