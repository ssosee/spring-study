package seaung.di;

public class BeanFactory {
    public void driver() {
        // Bean 생성
        Avante avante = new Avante();
        // 의존성 주입
        Driver driver = new Driver(avante);
    }
}
