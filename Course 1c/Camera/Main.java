public class Main {
    public static void main(String[] args) {
        Camera myFavouriteCamera = new Camera();

        myFavouriteCamera.takePicture("Portrait");
        myFavouriteCamera.takePicture(1080);
        myFavouriteCamera.takePicture("Landscape", 720);

    }
}
