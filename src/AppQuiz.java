
public class AppQuiz {
  int point;
  int total;
  public static void main(String[] args) {
    AppQuiz aq = new AppQuiz();
    aq.init();
  }
  public void init(){

  }
  public int question1(){
    return point;
  }
  public int question2(){
    return point;
  }
  public int question3(){
    return point;
  }
  public int question4(){
    return point;
  }
  public int question5(){
	  System.out.println("��5");
	  System.out.println("���E�ŁA����Ɖ����ǂ����������H");
	  System.out.println("1:����,2:�����");
	  do{
			System.out.println(point = sc.nextInt());
			if( point < 1 || 3 < point) {
				System.out.println("�}�i�[�����܂��傤(�M�E�ցE�L)");
				System.out.println();
			}
			if(point == 3){
		  System.out.println("���O���i���o�[1���I");
		  point = 100;
	  }
	}while( point < 1 || 2 < point);
	  return point;
  }
  public int question6(){
    return point;
  }
}
