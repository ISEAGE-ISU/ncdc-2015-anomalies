#No, It's Not Stego
##Grading
Submissions are graded on whether or not they manage to describe the
file. The file is a bitmap image (tux.bmp) that has been encrypted with
AES128 using the ECB mode. 

Teams are not expected to be able to fully
decrypt the image, just identify that it is a picture of a penguin.

If they manage to accurately describe the image 
(a penguin with the word Linux below
it), that is worth full points. 

Partial points will be awarded for descriptions of how the image was 
encrypted or hints towards what the original file was. The more
specific, the more points. Weigh points more heavily if they are able to
identify how the file was encrypted (AES128 with ECB) than just being able
to guess at the file content or describe it (low entropy, weak encryption).
Identifying it as an image or bmp image should also be weighed heavily, since 
it is very close to getting the right answer.

###Description elements worth partial points###
- An image
- An uncompressed image
- A bitmap image (.bmp)
- A black and white image
- Large parts of the file are identical
- Mostly empty file
- Mostly the same throughout the file
- Very little entropy (randomness, change, etc)
- File was encrypted with ECB (Electronic Codebook) mode
- Weak encryption mode (Must specify "mode". "Weak cipher" is explicitly incorrect)
- Encrypted with AES128 (or just AES)
- Encrypted with symmetric encryption
- 128 bit encryption or blocks
