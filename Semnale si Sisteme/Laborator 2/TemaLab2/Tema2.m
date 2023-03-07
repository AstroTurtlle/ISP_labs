n = -5:0.1:5;
x = @(n)(4.*cos(pi*n));
subplot(2,3,1);
stem(n,x(n));
title("x[n]=4cos(\pin)");

n = -5:0.1:5;
x = @(n)(2.*sin(3*n));
subplot(2,3,2);
stem(n,x(n));
title("x[n]=2sin(3n)");

n = -5:0.1:5;
x = @(n)(0.9.^n.*cos(pi*n/10));
subplot(2,3,3);
stem(n,x(n));
title("x[n]=0.9^ncos(\pin/10)");

t = -5:0.1:5;
x = @(t)(4.*sin(5*pi*t-pi/4));
subplot(2,3,4);
plot(t,x(t));
title("x(t)=4sin(5\pit-\pi/4)");

t = -5:0.1:5;
x = @(t)(cos(4*t)+2.*sin(8*t));
subplot(2,3,5);
plot(t,x(t));
title("x(t)=cos(4t)+2sin(8t)");

t = -5:0.1:5;
x = @(t)(3.*cos(4*t)+sin(pi*t));
subplot(2,3,6);
plot(t,x(t));
title("x(t)=3cos(4t)+sin(\pit)");