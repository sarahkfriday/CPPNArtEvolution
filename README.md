# CPPNArtEvolutionandWFC

How to make a Zentangle:
	* run PicbreederTask.java
	* evolve images until you find some that you think would make interesting patterns
	* select 3 images and press zentangle! it may take take a few moments.
	* the first selected image becomes the background 
		(first from top-left to bottom-right, NOT first chronologically)
	* the remaining two images will fill be converted into a pattern by WFC and used to fill
		the white and black spaces from the background image.
	* your image should appear in a new window :)

For this project, we have edited InteractiveEvolutionTask, which is implemented by a few other "tasks", such as breedesizer and animationbreeder. As a result, these will also have a zentangle button, but it won't do anything good there; it is only meant for vanilla Picbreeder as we have configured it (dual tone black and white).

- Sarah Friday, Anna Krolikowski, and Alice Quintanilla

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