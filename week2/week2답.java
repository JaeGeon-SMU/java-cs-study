2. .java 파일이 실행되는 과정을 설명하시오.
        1. javac(컴파일러)가 .java 파일을 .class(자바 바이트 코드)로 변환
        2. class Loader를 통해 jvm에 .class 파일들을 올린다.
        3. Execution Engine의 interpreter와 jit compiler를 통해 해석되어 Rutime Data Area에 배치되어 실행된다.
3. 변수의 종류에는 인스턴스 변수,클래스 변수, 지역 변수가 있다. 각 변수의 스코프와 라이프 타임에 대해 설명하시오.
        인스턴스 변수
                - 클래스 내부,메소드 외부에 선언된 변수
                - 정적 메서드를 제외한 class 전체가 scope
                - 인스턴스가 생성될 때 생성되어 인스턴스가 메모리에서 사라질 때까지가 lifetime
        클래스 변수
                - 클래스 내부, 메서드 블록 외부에 static으로 선언된 변수
                - 클래스가 메모리에 로딩되는 순간부터 프로그램 종료시까지 lifetime
                - 클래스 변수의 값은 모든 인스턴스가 공유한다.
        지역 변수
                - 인스턴스,클래스 변수가 아닌 모든 변수
                - 선언된 메서드 블록 내에서만 유효
                - 해당 변수가 있는 메서드 실행시부터 종료시까지 lifetime

4. 콘텍스트 스위칭이 일어나는 상황과 과정을 설명하시오. (Process p1과 Process p2가 있다고 가정)
                        p1이 인터럽트가 발생했을 때 p2로 콘텍스트 스위칭이 일어나게된다.
                        p1은 인터럽트가 발생되면 현재 상태를 P1 PCB에 저장하고 P2는 P2 PCB에 있던 상태를 CPU에 불러와 실행한다.
                        p2에서 인터럽트가 발생되면 현재 상태를 P2 PCB에 저장하고 P1은 P1 PCB에 있던 상해를 CPU에 불러와 실행한다.
5. 3항 연산자가 무엇인지 예시를 들어 설명하시오.
    if-else 조건문을 간결하게 표현한 형태이다 a>b ? a : b를 예시로 들면 a>b인 경우 a가 반환되고 a>b가 아닌경우 b가 반환된다.

6. A는 Object를 상속받고 B는 A를 상속받는다고 가정했을때, 다음 코드의 실행 결과는 무엇인가?
b is instanceof A
b is instanceof Obj
a is instanceof Obj

7. 빈칸에 알맞은 말을 넣으시오
중기 스케줄링 : 스왑 아웃, 스왑 인을 통해 메모리에 로드되는 프로세스 수를 동적으로 조절한다.
장기 스케줄링 : 준비 큐에 어떤 프로세스를 넣을지 결정해 메모리에 올라가는 프로세스 수를 조절한다.
단기 스케줄링 : 준비큐에 있는 대기 프로세스 중 어떤 프로세를 다음으로 실행할지 결정한다.

8. 비선점형 스케줄링은 무엇이고 방식 2가지와 선점형 스케줄링은 무엇이고 방식 3가지를 적으시오.
비선점형 스케줄링이란 실행중인 프로세스가 종료될 때까지 다른 프로세를 실행시킬 수 없는 방식이고,
선점형 스케줄링이란 다른 프로세스가 끝나기 전에 중단시키고 다른 프로세스를 실행할 수 있는 방식을 의미한다.
비선점형 : FCFS, SJF
선점형 : RR,SRTF,멀티 레벨 스케줄링

9. 내부,외부 단편화란?
내부 단편화 : 프로세스의 크기보다 큰 메모리 영역을 할당받아 메모리 공간이 낭비되는 경우를 의미한다.
외부 단편화 : 총 사용 가능한 메모리 공간은 충분하지만 공간이 조각나 있어 할당할 수 없는 경우를 의미한다.

10. 최초 적합,최악 적합이란?
가용할 수 있는 조각난 메모리 공간 중 프로세스의 크기보다 큰 메모리 공간을 처음 발견하면 해당하는 공간에 할당하는 방법을 최초 적합이라 한다.
프로세스의 크기보다 큰 메모리 공간 중 가장 큰(비어있는 공간이 많은) 공간에 할당하는 방법을 최악 적합이라 한다.

11. 비연속 메모리 할당 방법 2가지
페이징, 세그멘테이션

12. 시간,공간적 지역성이란?
시간 지역성 : 최근에 참조한 내용은 다시 참조할 가능성이 높은 것을 의미한다.
공간 지역성 : 참조한 주소 근처의 내용을 참조할 가능이 높은 것을 의미한다.

13. 요구페이징이 어떻게 동작하는지 설명하시오.
1. 필요한 페이지가 물리 메모리에 있는지 페이지 테이블을 통해 확인한다.
2. 필요한 페이지가 없는 경우 i비트를 반환하고 유효한 주소인지 판단한다.(프레임의 범위를 넘어서지 않는지)
3. 디스크에서 필요한 페이지를 스왑 인 한다.
4. 물리 메모리가 가득 찬 경우 교체 알고리즘을 통해 교체를 진행하고, 아닌 경우 비어 있는 물리 메모리에 로드한다.
5. 페이지 테이블을 갱신한다.