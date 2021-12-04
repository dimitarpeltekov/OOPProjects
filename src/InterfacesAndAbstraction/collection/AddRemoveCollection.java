package InterfacesAndAbstraction.collection;

public class AddRemoveCollection extends Collection implements AddRemovable{
    @Override
    public String remove() {
        return super.getItems().remove(getItems().size()-1);
    }

    @Override
    public int add(String item) {
        super.getItems().add(0,item);
        return 0;
    }
}
