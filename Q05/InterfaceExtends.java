interface X {
    void xfun();
}

interface Y {
    void yfun();
}

interface Z extends X,Y{
    void zfun();
}

public class InterfaceExtends implements Z {

    @Override
    public void xfun() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void yfun() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void zfun() {
        // TODO Auto-generated method stub
        
    }
    
}
