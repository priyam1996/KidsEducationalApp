package com.kuncham.kidseducationalapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Alphabets extends AppCompatActivity {


    ImageView im;
    MediaPlayer a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabets);

      //  getSupportActionBar().hide();

        im=(ImageView)findViewById(R.id.alphabet);

        ImageView home_image = (ImageView)findViewById(R.id.gohome_image);
        home_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(Alphabets.this,HomePage.class);
                startActivity(homeIntent);
            }
        });


    }




   public void a(View v){
       im.setImageResource(R.drawable.a);
       a=MediaPlayer.create(this,R.raw.a);
       a.start();
       Animation an= AnimationUtils.loadAnimation(this,R.anim.alpha_anim);
       v.startAnimation(an);
   }
    public void b(View v){
        im.setImageResource(R.drawable.b);
        b=MediaPlayer.create(this,R.raw.b);
        b.start();
        Animation an= AnimationUtils.loadAnimation(this,R.anim.alpha_anim);
        v.startAnimation(an);
    }
    public void c(View v){
        im.setImageResource(R.drawable.c);
        c=MediaPlayer.create(this,R.raw.c);
        c.start();
        Animation an= AnimationUtils.loadAnimation(this,R.anim.alpha_anim);
        v.startAnimation(an);
    }
    public void d(View v){
        im.setImageResource(R.drawable.d);
        d=MediaPlayer.create(this,R.raw.d);
        d.start();
        Animation an= AnimationUtils.loadAnimation(this,R.anim.alpha_anim);
        v.startAnimation(an);
    }
    public void e(View v){
        im.setImageResource(R.drawable.e);
        e=MediaPlayer.create(this,R.raw.e);
        e.start();
        Animation an= AnimationUtils.loadAnimation(this,R.anim.alpha_anim);
        v.startAnimation(an);
    }
    public void f(View v){
        im.setImageResource(R.drawable.f);
        f=MediaPlayer.create(this,R.raw.f);
        f.start();
        Animation an= AnimationUtils.loadAnimation(this,R.anim.alpha_anim);
        v.startAnimation(an);
    }
    public void g(View v){
        im.setImageResource(R.drawable.g);
        g=MediaPlayer.create(this,R.raw.g);
        g.start();
        Animation an= AnimationUtils.loadAnimation(this,R.anim.alpha_anim);
        v.startAnimation(an);
    }
    public void h(View v){
        im.setImageResource(R.drawable.h);
        h=MediaPlayer.create(this,R.raw.h);
        h.start();
        Animation an= AnimationUtils.loadAnimation(this,R.anim.alpha_anim);
        v.startAnimation(an);
    }
    public void i(View v){
        im.setImageResource(R.drawable.i);
        i=MediaPlayer.create(this,R.raw.i);
        i.start();
        Animation an= AnimationUtils.loadAnimation(this,R.anim.alpha_anim);
        v.startAnimation(an);
    }
    public void j(View v){
        im.setImageResource(R.drawable.j);
        j=MediaPlayer.create(this,R.raw.j);
        j.start();
        Animation an= AnimationUtils.loadAnimation(this,R.anim.alpha_anim);
        v.startAnimation(an);
    }
    public void k(View v){
        im.setImageResource(R.drawable.k);
        k=MediaPlayer.create(this,R.raw.k);
        k.start();
        Animation an= AnimationUtils.loadAnimation(this,R.anim.alpha_anim);
        v.startAnimation(an);
    }
    public void l(View v){
        im.setImageResource(R.drawable.l);
        l=MediaPlayer.create(this,R.raw.l);
        l.start();
        Animation an= AnimationUtils.loadAnimation(this,R.anim.alpha_anim);
        v.startAnimation(an);
    }
    public void m(View v){
        im.setImageResource(R.drawable.m);
        m=MediaPlayer.create(this,R.raw.m);
        m.start();
        Animation an= AnimationUtils.loadAnimation(this,R.anim.alpha_anim);
        v.startAnimation(an);
    }
    public void n(View v){
        im.setImageResource(R.drawable.n);
        n=MediaPlayer.create(this,R.raw.n);
        n.start();
        Animation an= AnimationUtils.loadAnimation(this,R.anim.alpha_anim);
        v.startAnimation(an);
    }
    public void o(View v){
        im.setImageResource(R.drawable.o);
        o=MediaPlayer.create(this,R.raw.o);
        o.start();
        Animation an= AnimationUtils.loadAnimation(this,R.anim.alpha_anim);
        v.startAnimation(an);
    }
    public void p(View v){
        im.setImageResource(R.drawable.p);
        p=MediaPlayer.create(this,R.raw.p);
        p.start();
        Animation an= AnimationUtils.loadAnimation(this,R.anim.alpha_anim);
        v.startAnimation(an);
    }
    public void q(View v){
        im.setImageResource(R.drawable.q);
        q=MediaPlayer.create(this,R.raw.q);
        q.start();
        Animation an= AnimationUtils.loadAnimation(this,R.anim.alpha_anim);
        v.startAnimation(an);
    }
    public void r(View v){
        im.setImageResource(R.drawable.r);
        r=MediaPlayer.create(this,R.raw.r);
        r.start();
        Animation an= AnimationUtils.loadAnimation(this,R.anim.alpha_anim);
        v.startAnimation(an);
    }
    public void s(View v){
        im.setImageResource(R.drawable.s);
        s=MediaPlayer.create(this,R.raw.s);
        s.start();
        Animation an= AnimationUtils.loadAnimation(this,R.anim.alpha_anim);
        v.startAnimation(an);
    }
    public void t(View v){
        im.setImageResource(R.drawable.t);
        t=MediaPlayer.create(this,R.raw.t);
        t.start();
        Animation an= AnimationUtils.loadAnimation(this,R.anim.alpha_anim);
        v.startAnimation(an);
    }
    public void u(View v){
        im.setImageResource(R.drawable.u);
        u=MediaPlayer.create(this,R.raw.u);
        u.start();
        Animation an= AnimationUtils.loadAnimation(this,R.anim.alpha_anim);
        v.startAnimation(an);
    }
    public void v(View v1){
        im.setImageResource(R.drawable.v);
        v=MediaPlayer.create(this,R.raw.v);
        v.start();
        Animation an= AnimationUtils.loadAnimation(this,R.anim.alpha_anim);
        v1.startAnimation(an);
    }
    public void w(View v){
        im.setImageResource(R.drawable.w);
        w=MediaPlayer.create(this,R.raw.w);
        w.start();Animation an= AnimationUtils.loadAnimation(this,R.anim.alpha_anim);
        v.startAnimation(an);
    }
    public void x(View v){
        im.setImageResource(R.drawable.x);
        x=MediaPlayer.create(this,R.raw.x);
        x.start();
        Animation an= AnimationUtils.loadAnimation(this,R.anim.alpha_anim);
        v.startAnimation(an);
    }
    public void y(View v){
        im.setImageResource(R.drawable.y);
        y=MediaPlayer.create(this,R.raw.y);
        y.start();
        Animation an= AnimationUtils.loadAnimation(this,R.anim.alpha_anim);
        v.startAnimation(an);
    }
    public void z(View v){
        im.setImageResource(R.drawable.z);
        z=MediaPlayer.create(this,R.raw.z);
        z.start();
        Animation an= AnimationUtils.loadAnimation(this,R.anim.alpha_anim);
        v.startAnimation(an);
    }




}
