package com.kuncham.kidseducationalapp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class Alphabets extends AppCompatActivity {


    ImageView im;
    MediaPlayer a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabets);

        im=(ImageView)findViewById(R.id.alphabet);




    }

   public void a(View v){
        im.setImageResource(R.drawable.a);
        a=MediaPlayer.create(this,R.raw.a);
        a.start();
   }
    public void b(View v){
        im.setImageResource(R.drawable.b);
        b=MediaPlayer.create(this,R.raw.b);
        b.start();
    }
    public void c(View v){
        im.setImageResource(R.drawable.c);
        c=MediaPlayer.create(this,R.raw.c);
        c.start();
    }
    public void d(View v){
        im.setImageResource(R.drawable.d);
        d=MediaPlayer.create(this,R.raw.d);
        d.start();
    }
    public void e(View v){
        im.setImageResource(R.drawable.e);
        e=MediaPlayer.create(this,R.raw.e);
        e.start();
    }
    public void f(View v){
        im.setImageResource(R.drawable.f);
        f=MediaPlayer.create(this,R.raw.f);
        f.start();
    }
    public void g(View v){
        im.setImageResource(R.drawable.g);
        g=MediaPlayer.create(this,R.raw.g);
        g.start();
    }
    public void h(View v){
        im.setImageResource(R.drawable.h);
        h=MediaPlayer.create(this,R.raw.h);
        h.start();
    }
    public void i(View v){
        im.setImageResource(R.drawable.i);
        i=MediaPlayer.create(this,R.raw.i);
        i.start();
    }
    public void j(View v){
        im.setImageResource(R.drawable.j);
        j=MediaPlayer.create(this,R.raw.j);
        j.start();
    }
    public void k(View v){
        im.setImageResource(R.drawable.k);
        k=MediaPlayer.create(this,R.raw.k);
        k.start();
    }
    public void l(View v){
        im.setImageResource(R.drawable.l);
        l=MediaPlayer.create(this,R.raw.l);
        l.start();
    }
    public void m(View v){
        im.setImageResource(R.drawable.m);
        m=MediaPlayer.create(this,R.raw.m);
    }
    public void n(View v){
        im.setImageResource(R.drawable.n);
        n=MediaPlayer.create(this,R.raw.n);
        n.start();
    }
    public void o(View v){
        im.setImageResource(R.drawable.o);
        o=MediaPlayer.create(this,R.raw.o);
        o.start();
    }
    public void p(View v){
        im.setImageResource(R.drawable.p);
        p=MediaPlayer.create(this,R.raw.p);
        p.start();
    }
    public void q(View v){
        im.setImageResource(R.drawable.q);
        q=MediaPlayer.create(this,R.raw.q);
        q.start();
    }
    public void r(View v){
        im.setImageResource(R.drawable.r);
        r=MediaPlayer.create(this,R.raw.r);
        r.start();
    }
    public void s(View v){
        im.setImageResource(R.drawable.s);
        s=MediaPlayer.create(this,R.raw.s);
        s.start();
    }
    public void t(View v){
        im.setImageResource(R.drawable.t);
        t=MediaPlayer.create(this,R.raw.t);
        t.start();
    }
    public void u(View v){
        im.setImageResource(R.drawable.u);
        u=MediaPlayer.create(this,R.raw.u);
        u.start();
    }
    public void v(View v1){
        im.setImageResource(R.drawable.v);
        v=MediaPlayer.create(this,R.raw.v);
        v.start();
    }
    public void w(View v){
        im.setImageResource(R.drawable.w);
        w=MediaPlayer.create(this,R.raw.w);
        w.start();
    }
    public void x(View v){
        im.setImageResource(R.drawable.x);
        x=MediaPlayer.create(this,R.raw.x);
        x.start();
    }
    public void y(View v){
        im.setImageResource(R.drawable.y);
        y=MediaPlayer.create(this,R.raw.y);
        y.start();
    }
    public void z(View v){
        im.setImageResource(R.drawable.z);
        z=MediaPlayer.create(this,R.raw.z);
        z.start();
    }


}
