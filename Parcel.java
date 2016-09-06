class Parcel {
  public int mHeight;
  public int mWidth;
  public int mLength;
  public int mWeight;
  public int mDistance;
  public int mSpeed;

  public Parcel(int height, int width, int length, int weight, int distance, int speed) {
    mHeight = height;
    mWidth = width;
    mLength = length;
    mWeight = weight;
    mDistance = distance;
    mSpeed = speed;
  }

  public static void parcelVolume(int height, int width, int length) {
    Integer parcelVolume = height*width*length;
    System.out.println("Your parcel has a volume of " + parcelVolume + " inches.");
  }

  public static void costToShip(int weight, int distance, int speed) {
    Integer costToShip = (distance/2+weight)*speed ;
    System.out.println("It will cost $" + costToShip);
  }
}
