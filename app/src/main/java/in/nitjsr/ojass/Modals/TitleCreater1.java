package in.nitjsr.ojass.Modals;

import android.content.Context;



import java.util.ArrayList;
import java.util.List;

import in.nitjsr.ojass.Activities.FeedActivity;

/**
 * Created by admin on 19-01-2017.
 */

public class TitleCreater1 {
    public static TitleCreater1 _titleCreator;

    public static List<TitleParent> _titleParents;

    public TitleCreater1(Context context) {
        _titleParents=new ArrayList<>();
        _titleParents.clear();

        for(int i = FeedActivity.data.size()-1; i>=0; i--)
        {
            _titleParents.add(new TitleParent(FeedActivity.data.get(i).getQuestion()));
            // Toast.makeText(context,"Q"+FAQActivity.data.get(i).getQuestion(),Toast.LENGTH_SHORT).show();

        }

       /*
        TitleParent title =new TitleParent(String.format("How should questions for FAQs be formatted?"));
        _titleParents.add(title);
        title =new TitleParent(String.format("How should a page of FAQs be titled?"));
        _titleParents.add(title);
        title =new TitleParent(String.format("How do I insert an arrow to return to the top of the page?"));
        _titleParents.add(title);
        title =new TitleParent(String.format("Where can I find a good example of an FAQ?"));
        _titleParents.add(title);
        for(int i=5;i<=20;i++)
        {
            title=new TitleParent(String.format("This is Question #%d",i));
            _titleParents.add(title);
        }*/
    }

    public static TitleCreater1 get(Context context)
    {
        if(_titleCreator == null)
            _titleCreator=new TitleCreater1(context);
        return _titleCreator;
    }

    public List<TitleParent> getAll() {
        return _titleParents;
    }
}
