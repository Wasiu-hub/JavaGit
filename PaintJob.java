
/** Paint Job
 Bob is a wall painter, and he needs your help. You have to write a program that helps Bob calculate how many buckets of paint he needs to buy before going to work. Bob might also have some extra buckets at home. He also knows the area that he can cover with one bucket of paint.
 1. Write a method named getBucketCount with 4 parameters. The first parameter should be named width of type double. This parameter represents the width of the wall. The second parameter should be named height of type double. This parameter represents the height of the wall. The third parameter should be named areaPerBucket. This parameter represents the area that can be covered with one bucket of paint. The fourth parameter should be named extraBuckets. This parameter represents the bucket count that Bob has at home. The method needs to return a value of type int that represents the number of buckets that Bob needs to buy before going to work. To calculate the bucket count, refer to the notes below. If one of the parameters width, height or areaPerBucket is less or equal to 0 or if extraBuckets is less than 0, the method needs to return -1 to indicate an invalid value. If all parameters are valid, the method needs to calculate the number of buckets and return it.
 2. Bob does not like to enter 0 for the extraBuckets parameter so he needs another method. Write another overloaded method named getBucketCount with 3 parameters namely width, height, and areaPerBucket (all of type double). This method needs to return a value of type int that represents the number of buckets that Bob needs to buy before going to work. To calculate the bucket count, refer to the notes below. If one of the parameters width, height or areaPerBucket is less or equal to 0, the method needs to return -1 to indicate an invalid value. If all parameters are valid, the method needs to calculate the number of buckets and return it.
 */
public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
    if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
        return -1;
    }
    double wallArea = width * height;
    double numberOfBuckets = (wallArea / areaPerBucket);
    double neededBuckets = Math.ceil(numberOfBuckets);
    return (int)(neededBuckets - extraBuckets);
}
    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        double wallArea = width * height;
        double numberOfBuckets = (wallArea / areaPerBucket);
        double neededBuckets = Math.ceil(numberOfBuckets);
        return (int) (neededBuckets);
    }
    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        double numberOfBuckets = (area / areaPerBucket);
        double neededBuckets = Math.ceil(numberOfBuckets);
        return (int) (neededBuckets);
    }
