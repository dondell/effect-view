precision mediump float;

uniform sampler2D s_texture;
varying vec2 v_texCoord;
uniform float time;
uniform vec2 size;

void main() {
    vec2 tc = vec2(v_texCoord.x*size.x,v_texCoord.y*size.y);
	vec2 dist = normalize(tc-size/2.0);
	vec4 color=vec4(0);

	float steps = 3.0;
	for(float f=0.0;f<steps;f++){
   		color+=texture2D(s_texture, v_texCoord + 10.0*sin(time)*f*dist/size);
   	}

    gl_FragColor = color/steps;
 }
