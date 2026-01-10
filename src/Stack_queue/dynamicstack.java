package Stack_queue;

import com.Rastogi.D_linked_list;

import javax.swing.plaf.PanelUI;

public class dynamicstack extends CustomStack{

    public dynamicstack(){
        super();
    }
    public dynamicstack(int size){
        super(size);
    }
    @Override

    public boolean push(int item){

        if(this.isfull()){
            int [] temp = new int[data.length*2];
            for (int i = 0; i < data.length; i++) {
                temp[i]=data[i];
            }

            data = temp;
        }
        return super.push(item);
    }
}
