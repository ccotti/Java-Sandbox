public class PaintJob {

    public static void main(String[] args) {
        System.out.println(getBucketCount(-3.4,2.1,1.5,2));
        System.out.println(getBucketCount(3.4,2.1,1.5,2));
        System.out.println(getBucketCount(2.75,3.25,2.5,1));
        System.out.println("-------------------------");
        System.out.println(getBucketCount(-3.4,2.1,1.5));
        System.out.println(getBucketCount(3.4,2.1,1.5));
        System.out.println(getBucketCount(7.25,4.3,2.35));
        System.out.println("-------------------------");
        System.out.println(getBucketCount(3.4,1.5));
        System.out.println(getBucketCount(6.26,2.2));
        System.out.println(getBucketCount(3.26,0.75));
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {

        double numBuckets;
        double area;
        double areaRemaining;

        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }

        area = width * height;
        areaRemaining = area - (extraBuckets * areaPerBucket);
        numBuckets = Math.ceil(areaRemaining / areaPerBucket);

        return (int) numBuckets;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {

        double numBuckets;
        double area;

        if(width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        area = width * height;
        numBuckets = Math.ceil(area / areaPerBucket);

        return (int) numBuckets;
    }

    public static int getBucketCount(double area, double areaPerBucket) {

        double numBuckets;

        if(area <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        numBuckets = Math.ceil(area / areaPerBucket);

        return (int) numBuckets;
    }
}
