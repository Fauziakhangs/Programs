#### Example Project

#### categorical variables: Intuitive
#### Highly biased model:
#### Random forest : extension of decision tree:
#### Overcome over fitting:
#### Builds a tree and split happens wih 
#### a small set of features instead of using
#### all features and takes the avg of all the trees:

setwd("~/Data_Analysis")

install.packages("randomForest")
                     
                     
## for text file
mydata <-read.table("stepping.txt", header = F)
head(mydata)

## barplot
barplot(table(mydata$V1))
summary(mydata$V1)
mydata$examine <- ifelse(mydata$V1 < 20, "bad", "good")
mydata$examine[mydata$V1 == 20] <- "nomal"
mydata$examine <- as.factor(mydata$examine)
table(mydata$examine)


## splitting data into training and testing
## before building our model lets split 
# data set into training and testing
set.seed(1234)
samp <- sample(nrow(mydata), 0.6 * nrow(mydata))
train <- mydata[samp, ]
test <- mydata[-samp,]

library(randomForest) # loading library
model <- randomForest(examine ~ . , data = train)
model
# it also shows the matrix prediction vs actual
# for each class.

# predicting model in new dataset
pred <- predict(model, newdata = test)
pred
table (pred, test$examine)
# accuracy : Tp+TN / (TP+TN+FP+FN)

(7+4+0) / nrow(test)
# 91.66 accuracy








