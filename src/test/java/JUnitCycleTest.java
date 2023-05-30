import org.junit.jupiter.api.*;

public class JUnitCycleTest {

    @BeforeAll
    /*
    전체 테스트를 시작하기 전에 1회 실행하므로 메서드는 static으로 선언
    DB연결해야하거나 테스트 환경을 초기화할때 사용
     */
    static void beforeAll() {
        System.out.println("@BeforeAll");

    }

    @BeforeEach
    /*
     테스트 케이스를 시작하기 전마다 실행
     테스트 메서드에서 사용하는 객체르르 초기화하거나
     테스트에 필요한 값을 미리 넣을 때 사용.
     각 인스턴스에 대한 메서드를 호출해야하므로 static이 아니어야 함.
     */
    public void beforeEach() {
        System.out.println("@BeforeEach");
    }

    @Test
    public void test1() {
        System.out.println("test1");
    }

    @Test
    public void test2() {
        System.out.println("test2");
    }

    @Test
    public void test3() {
        System.out.println("test3");
    }

    @Test
    public void test4() {
        System.out.println("test4");
    }

    @AfterAll // 전체 테스트를 마치고 종료하기 전에 1회 실행하므로 메서드는 static으로 선언
    static void afterAll() {
        System.out.println("@AfterAll");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("@AfterEach");
    }

}
