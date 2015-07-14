## COMMANDS
------------

* Get Working Directory - getwd()

* Set Working Directory - setwd()

* Reading a csv files = read.csv()


* Functions : 
my_function_name <- function() {
    x <- rnorm(100)
    mean(x)
}

Function call : my_function_name()


* Loading/Importing a File into the working directory - source("my_file_name")

* Comments -  ##

*  Concatenating/Combining Objects Eg: x <- c("a", "b") | If they are of the same class, then the object that contains these values will also be of the same class. If not, then it would be the LCM of the classes :
For instance c(Numeric, Character) is a character | c(boolean, Numeric) is Numeric | c(char, bool) is char

* class(x) - Returns the data type of the object [Similar to type() in Python]

* Matrix : mat_var <- matrix(nrows, ncol) | Dimensionality of the Matrix dim(m)

* Matrices can also be formed by 'binding' columns or rows via cbind() or rbind()

* factors_var <- factor(c(1,2,2,2,))
Level = 1,2

* 
