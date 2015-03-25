public class stackArray<E>{
    Object[] array = new Object[0];
    
    public void push(E data){
	Object[] newArray = new Object[array.length+1];
	newArray[0] = data;
	int j = 1;		
	for(int i = 0; i < array.length; i++){
	    newArray[j] = array[i];
	    j++;
	}
	newArray = array;
    }

    public E pop(){
	Object tmp = array[0];	
	Object[] newArray = new Object[array.length-1];
	int j = 0;
	for(int i = 1; i < array.length; i++){
	    newArray[j] = array[i];
	}
	array = newArray;
	return (E)tmp;	
    }

    public boolean empty(){
	return(array.length==0);
    }

    public E top() {
	return (E)array[0];
    }
}
