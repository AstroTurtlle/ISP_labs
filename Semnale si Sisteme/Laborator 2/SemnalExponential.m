a = 0.2; b = -0.5;
t1 = 0; tstep = 0.5; t2 = 8;
t = t1:tstep:t2;
xe = a*exp(b*t);
figure;
plot(t,xe);grid;
xlabel('t'); ylabel('x_e(t)');
title('x_e(t) = a e^{bt}');

xe = @(t)(a*exp(b*t));
t=[t1,t2];
figure; fplot(xe, t); grid;
xlabel('t'); ylabel('x_e(t)');
title('x_e(t) = a e^{bt} fplot');