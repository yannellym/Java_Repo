package inheritance;

public class Square extends Rectangulo {
    @Override
    public double calculatePerimeter(){
        return sides * length;
    }
    public void print(String what){
        System.out.println("Im a" + what);

    }
}
