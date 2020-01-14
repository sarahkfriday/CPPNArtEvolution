# Quantum Zentanglement

This program makes computer generated Zentangles by first evolving images in Picbreeder with a Compositional Pattern Producing Network and then assembling chosen images into patterns using Wave Function Collapse. 

![Picbreeder Diagram](https://github.com/sarahkfriday/QuantumZentanglement/blob/master/images/picbreeder-diagram.PNG)

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
* Run ``bash Launch-Zentangle-Interactive.bat`` from the terminal to create Zentangles interactively or choose any of the
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

Total Number of Images | Used for Templates | Used for tiles | Additional Information
------------- | ------------- | ------------- | --------------------
2 | 1 | 1 |
3 | 1 | 2 |
4 | 2 | 3 | 1 of the images is used as both a template and pattern
5 | 2 | 3 | Uses the intersection of the two templates 
6 - up | 1 | 5 - up | Multiple images are used in each pattern

Tile images are used as input to the Wave Function Collapse algorithm to make pattern images. Below is an example of assembling a Zentangle from 3 tile images: 1 template and 2 patterns.

<img alt="Tile  1" width="200" height="200" src="https://github.com/sarahkfriday/QuantumZentanglement/blob/master/images/tile1.bmp"> | <img  alt="Tile  2" width="200" height="200" src="https://github.com/sarahkfriday/QuantumZentanglement/blob/master/images/tile2.bmp"> | <img alt="Template" width="200" height="200" src="https://github.com/sarahkfriday/QuantumZentanglement/blob/master/images/template.bmp">
:--------------:|:------------:|:-------------:
Tile 1 | Tile 2 | Template
<img alt="Pattern 1" width="200" height="200" src="https://github.com/sarahkfriday/QuantumZentanglement/blob/master/images/pattern1.jpg"> | <img alt="Pattern 2" width="200" height="200" src="https://github.com/sarahkfriday/QuantumZentanglement/blob/master/images/pattern2.jpg"> | <img alt="Zentangle" width="200" height="200" src="https://github.com/sarahkfriday/QuantumZentanglement/blob/master/images/zentangle.png?raw=true">
Pattern 1 | Pattern 2 | Final Zentangle


Tile 1 and Tile 2 are made into distinct pattern images. The patterns are then inserted into the template image. Pattern 1 fills the black area of the template while Pattern 2 fills the non-black.

For this project, we have edited InteractiveEvolutionTask, which is implemented by a few other "tasks", such as breedesizer and animationbreeder. As a result, these tasks will also have a Zentangle button, but it will not function in those tasks.

Publication coming soon.

- Sarah Friday, Anna Krolikowski, Alice Quintanilla, and Dr. Jacob Schrum

## Help

If you need any help, then please contact me at schrum2@southwestern.edu!

Also, you can evolve neural networks for lots of other interesting applications by using the original [MM-NEAT project](https://github.com/schrum2/MM-NEAT), which contains the interactive evolution code from this project, along with code to evolve agent behavior for various tasks (Ms. Pac-Man, Tetris, and Mario to name a few)
