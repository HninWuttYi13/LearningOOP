//parent class
 class Items {
    protected String name;
    protected String originalOwner;
    public Items(String name,String originalOwner) {
        this.name = name;
        this.originalOwner = originalOwner;
    }
    public void describe() {
        System.out.println("This is"+ this.name + "once beloging to" + this.originalOwner + ".");
    }
}
//subclass (inheritance from  parents class)
 class TomRiddleDiary extends Items {
    private String inkColor;
    public TomRiddleDiary(String name, String originalOwner, String inkColor) {
        super(name, originalOwner);
        this.inkColor = inkColor;
    }
    @Override
    public void describe(){
        super.describe();  //call the parent's describe method
        System.out.println("It bleeds " + this.inkColor + " ink when you write in it.");
    }
 }
 public class Main {
    public static void main(String[] args) {
        TomRiddleDiary diary = new TomRiddleDiary("Tom Riddle's Diary", "Tom Riddle", "Black");
        diary.describe();
    }
 }
//  This isTom Riddle's Diaryonce beloging toTom Riddle.
// It bleeds Black ink when you write in it.