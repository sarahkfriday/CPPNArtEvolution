# Quantum Zentanglement

This program makes computer generated Zentangles by first evolving images in Picbreeder with Compositional Pattern Producing Networks and then assembling chosen images into patterns using Wave Function Collapse. 

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
* Toggle the activation functions and color/black-white setting as you please. Keep the "stark" option on
* Increase or decrease the mutation rate for more change between generations
* Select at least two images and press the Z (Zentangle) button! It may take take a few moments
* Some of the images will be patterned using WFC and up to 2 will be used as template images
* The details of how a Zentangle is formed depend on how many images contribute to the Zentangle (see Zentangle Creation section)
* Your image will appear in a new window 

## Zentangle Creation

Images evolved from Picbreeder are randomly assigned roles as tiles or templates according to the table below.

Total Number of Images | Used for Templates | Used for tiles | Additional Information
------------- | ------------- | ------------- | --------------------
2 | 1 | 2 | One image used for both template and tiles.
3 | 1 | 2 | Template and tile images are distinct.
4 | 2 | 3 | One image used for both template and tiles. Uses intersection of two templates
5 | 2 | 3 | Template and tile images are distinct. Uses the intersection of two templates. 
6+ | 1 | 5+ | Multiple images are used in each of two tile patterns.

When using the intersection of two templates, areas that are black in both templates are filled with one pattern, areas that are non-black in both templates are filled with another pattern, and areas that are different in both are filled with the remaining pattern.

Tile images are used as input to the Wave Function Collapse algorithm to make pattern images. Below is an example of assembling a Zentangle from 3 tile images: 1 template and 2 patterns.

<img alt="Tile  1" width="200" height="200" src="https://github.com/sarahkfriday/QuantumZentanglement/blob/master/images/tile1.bmp"> | <img  alt="Tile  2" width="200" height="200" src="https://github.com/sarahkfriday/QuantumZentanglement/blob/master/images/tile2.bmp"> | <img alt="Template" width="200" height="200" src="https://github.com/sarahkfriday/QuantumZentanglement/blob/master/images/template.bmp">
:--------------:|:------------:|:-------------:
Tile 1 | Tile 2 | Template
<img alt="Pattern 1" width="200" height="200" src="https://github.com/sarahkfriday/QuantumZentanglement/blob/master/images/pattern1.jpg"> | <img alt="Pattern 2" width="200" height="200" src="https://github.com/sarahkfriday/QuantumZentanglement/blob/master/images/pattern2.jpg"> | <img alt="Zentangle" width="200" height="200" src="https://github.com/sarahkfriday/QuantumZentanglement/blob/master/images/zentangle.png?raw=true">
Pattern 1 | Pattern 2 | Final Zentangle


Tile 1 and Tile 2 are made into distinct pattern images. The patterns are then inserted into the template image. Pattern 1 fills the black area of the template while Pattern 2 fills the non-black.

### Human Interactive Evolution
Below are examples of human generated zentangle images.

Number of Images Used | Black and White | Color
--------- | --------------- | -----
2 | <img alt="2 Black and White 1" width="150" height="150" src="https://github.com/sarahkfriday/QuantumZentanglement/blob/master/images/bw2-1.png"> <img alt="2 Black and White 2" width="150" height="150" src="https://github.com/sarahkfriday/QuantumZentanglement/blob/master/images/bw2-2.png"> | <img alt="2 Color 1" width="150" height="150" src="https://github.com/sarahkfriday/QuantumZentanglement/blob/master/images/color2-1.png"> <img alt="2 Color 2" width="150" height="150" src="https://github.com/sarahkfriday/QuantumZentanglement/blob/master/images/color2-2.png">
3 | <img alt="3 Black and White 1" width="150" height="150" src="https://github.com/sarahkfriday/QuantumZentanglement/blob/master/images/bw3-1.png"> <img alt="3 Black and White 2" width="150" height="150" src="https://github.com/sarahkfriday/QuantumZentanglement/blob/master/images/bw3-2.png"> | <img alt="3 Color 1" width="150" height="150" src="https://github.com/sarahkfriday/QuantumZentanglement/blob/master/images/color3-1.png"> <img alt="3 Color 2" width="150" height="150" src="https://github.com/sarahkfriday/QuantumZentanglement/blob/master/images/color3-2.png">
4 | <img alt="4 Black and White 1" width="150" height="150" src="https://github.com/sarahkfriday/QuantumZentanglement/blob/master/images/bw4-1.png"> <img alt="4 Black and White 2" width="150" height="150" src="https://github.com/sarahkfriday/QuantumZentanglement/blob/master/images/bw4-2.png"> | <img alt="4 Color 1" width="150" height="150" src="https://github.com/sarahkfriday/QuantumZentanglement/blob/master/images/color4-1.png"> <img alt="4 Color 2" width="150" height="150" src="https://github.com/sarahkfriday/QuantumZentanglement/blob/master/images/color4-2.png">
5 | <img alt="5 Black and White 1" width="150" height="150" src="https://github.com/sarahkfriday/QuantumZentanglement/blob/master/images/bw5-1.png"> <img alt="5 Black and White 2" width="150" height="150" src="https://github.com/sarahkfriday/QuantumZentanglement/blob/master/images/bw5-2.png"> | <img alt="5 Color 1" width="150" height="150" src="https://github.com/sarahkfriday/QuantumZentanglement/blob/master/images/color5-1.png"> <img alt="5 Color 2" width="150" height="150" src="https://github.com/sarahkfriday/QuantumZentanglement/blob/master/images/color5-2.png">
6 | <img alt="6 Black and White 1" width="150" height="150" src="https://github.com/sarahkfriday/QuantumZentanglement/blob/master/images/bw6-1.png"> <img alt="6 Black and White 2" width="150" height="150" src="https://github.com/sarahkfriday/QuantumZentanglement/blob/master/images/bw6-2.png"> | <img alt="6 Color 1" width="150" height="150" src="https://github.com/sarahkfriday/QuantumZentanglement/blob/master/images/color6-1.png"> <img alt="6 Color 2" width="150" height="150" src="https://github.com/sarahkfriday/QuantumZentanglement/blob/master/images/color6-2.png">

### Automated Evolution
Automated evolution uses 3 different fitness schemes to evolve Picbreeder images towards a certain trajectory within 50 generations.

* Random: selects random images at each generation
* Half-Black: selects images with ratio of black to white pixels closest to 0.5
* Half-Black-3-Color: selects images using a combination of 4 fitness schemes
    * Half-black: see above
    * Red: maximize red channel and minimize others
    * Green: maximize green channel and minimize others
    * Blue: maximize blue channel and minimize others

Below is a table of automatically evolved zentangle images.

Number of Images Used | Random Black-White| Random Color | Half-Black | Half-Black-3-Color
--------- | --------------- | ----------------|-----------------|----------------
2 | <img alt="Random BW 2" width="150" height="150" src="https://github.com/sarahkfriday/QuantumZentanglement/blob/master/images/AutoRandBW2.png"> | <img alt="Random Color 2" width="150" height="150" src="https://github.com/sarahkfriday/QuantumZentanglement/blob/master/images/AutoRandom2.png"> | <img alt="Half Black 2" width="150" height="150" src="https://github.com/sarahkfriday/QuantumZentanglement/blob/master/images/AutoHB2.png"> | <img alt="Half Black 3 Color 2" width="150" height="150" src="https://github.com/sarahkfriday/QuantumZentanglement/blob/master/images/AutoHBC2.png">
3 | <img alt="Random BW 3" width="150" height="150" src="https://github.com/sarahkfriday/QuantumZentanglement/blob/master/images/AutoRandBW3.png"> | <img alt="Random Color 3" width="150" height="150" src="https://github.com/sarahkfriday/QuantumZentanglement/blob/master/images/AutoRandom3.png"> | <img alt="Half Black 3" width="150" height="150" src="https://github.com/sarahkfriday/QuantumZentanglement/blob/master/images/AutoHB3.png"> | <img alt="Half Black 3 Color 3" width="150" height="150" src="https://github.com/sarahkfriday/QuantumZentanglement/blob/master/images/AutoHBC3.png">
4 | <img alt="Random BW 4" width="150" height="150" src="https://github.com/sarahkfriday/QuantumZentanglement/blob/master/images/AutoRandBW4.png"> | <img alt="Random Color 4" width="150" height="150" src="https://github.com/sarahkfriday/QuantumZentanglement/blob/master/images/AutoRandom4.png"> | <img alt="Half Black 4" width="150" height="150" src="https://github.com/sarahkfriday/QuantumZentanglement/blob/master/images/AutoHB4.png"> | <img alt="Half Black 3 Color 4" width="150" height="150" src="https://github.com/sarahkfriday/QuantumZentanglement/blob/master/images/AutoHBC4.png">
5 | <img alt="Random BW 5" width="150" height="150" src="https://github.com/sarahkfriday/QuantumZentanglement/blob/master/images/AutoRandBW5.png"> | <img alt="Random Color 5" width="150" height="150" src="https://github.com/sarahkfriday/QuantumZentanglement/blob/master/images/AutoRandom5.png"> | <img alt="Half Black 5" width="150" height="150" src="https://github.com/sarahkfriday/QuantumZentanglement/blob/master/images/AutoHB5.png"> | <img alt="Half Black 3 Color 5" width="150" height="150" src="https://github.com/sarahkfriday/QuantumZentanglement/blob/master/images/AutoHBC5.png">
6 | <img alt="Random BW 6" width="150" height="150" src="https://github.com/sarahkfriday/QuantumZentanglement/blob/master/images/AutoRandBW6.png"> | <img alt="Random Color 6" width="150" height="150" src="https://github.com/sarahkfriday/QuantumZentanglement/blob/master/images/AutoRandom6.png"> | <img alt="Half Black 6" width="150" height="150" src="https://github.com/sarahkfriday/QuantumZentanglement/blob/master/images/AutoHB6.png"> | <img alt="Half Black 3 Color 6" width="150" height="150" src="https://github.com/sarahkfriday/QuantumZentanglement/blob/master/images/AutoHBC6.png">

For this project, we have edited InteractiveEvolutionTask, which is implemented by a few other "tasks", such as breedesizer and animationbreeder. As a result, these tasks will also have a Zentangle button, but it will not function in those tasks.

Publication coming soon.

- Sarah Friday, Anna Krolikowski, Alice Quintanilla, and Dr. Jacob Schrum

## Help

If you need any help, then please contact Dr. Jacob Schrum at schrum2@southwestern.edu!

Also, you can evolve neural networks for lots of other interesting applications by using the original [MM-NEAT project](https://github.com/schrum2/MM-NEAT), which contains the interactive evolution code from this project, along with code to evolve agent behavior for various tasks (Ms. Pac-Man, Tetris, and Mario to name a few)
