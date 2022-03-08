package tasks.classwork.day7;

public class ObjectContainer {

    private Object[] container;
    private int currentPlace;

    public ObjectContainer(Object[] container, int currentPlace) {
        this.container = new Object[10];
        this.currentPlace = 0;
    }

    public void add(Object o) {

        if(currentPlace < container.length){
            this.container[currentPlace++] = o;   // или можно отдельной строкой currentPlace++
        }

    }

    public Object removeLast() {

        if(currentPlace > 0) {
            Object temp = container[currentPlace - 1];
            container[--currentPlace] = null;
/*      второй вариант записи:
        container[currentPlace -1] = null;
        currentPlace--;*/
            return temp;
        }
        return null;
    }

    public boolean isEmpty() {
        return currentPlace == 0;   //если будет равно, вернет true, если нет - false
    }

}
