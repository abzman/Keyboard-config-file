# Matrix setup for COMMODORE 64

#led caps PD0
#led num PD1
#led scroll PF0

matrix
	scanrate 1
	debounce 5
	blocking 1

	sense			PB4		PE6		PD7		PC6	PD4	PF1	PF4	PD3	PD2
	strobe	PF5		1		ESC		LCTRL		PAUSE	SPACE	LGUI	Q	2	LANG_5
	strobe	PF6		3		W		A		LSHIFT	Z	S	E	4	UNASSIGNED
	strobe	PF7		5		R		D		X	C	F	T	6	UNASSIGNED
	strobe	PC7		7		Y		G		V	B	H	U	8	UNASSIGNED
	strobe	PD6		9		I		J		N	M	K	O	0	UNASSIGNED
	strobe	PB7		LANG_1		P		L		COMMA	PERIOD	LANG_3	LANG_4	MINUS	UNASSIGNED
	strobe	PB6		BACKSLASH	LANG_2		SEMICOLON	SLASH	RSHIFT	EQUAL	INSERT	HOME	UNASSIGNED
	strobe	PB5		BACKSPACE	ENTER		RIGHT		DOWN	F1	F3	F5	F7	UNASSIGNED
end

macroblock
	macro RIGHT SHIFT			#LEFT
		PUSH_META CLEAR_META ALL
		PRESS LEFT
		POP_ALL_META
	endmacro

	macro DOWN SHIFT			#UP
		PUSH_META CLEAR_META ALL
		PRESS UP
		POP_ALL_META
	endmacro

	macro 2 SHIFT				#2
		PUSH_META CLEAR_META ALL
		MAKE LSHIFT
		PRESS QUOTE
		BREAK LSHIFT
		POP_ALL_META
	endmacro

	macro 6 SHIFT				#6
		PUSH_META CLEAR_META ALL
		MAKE LSHIFT
		PRESS 7
		BREAK LSHIFT
		POP_ALL_META
	endmacro

	macro 7 SHIFT				#7
		PUSH_META CLEAR_META ALL
		PRESS QUOTE
		POP_ALL_META
	endmacro

	macro 8 SHIFT				#8
		PUSH_META CLEAR_META ALL
		MAKE LSHIFT
		PRESS 9
		BREAK LSHIFT
		POP_ALL_META
	endmacro

	macro 9 SHIFT				#9
		PUSH_META CLEAR_META ALL
		MAKE LSHIFT
		PRESS 0
		BREAK LSHIFT
		POP_ALL_META
	endmacro

	macro 0 SHIFT				#0
		PUSH_META CLEAR_META ALL
		POP_ALL_META
	endmacro

	macro LANG_1 SHIFT			#+
		PUSH_META CLEAR_META ALL
		POP_ALL_META
	endmacro

	macro MINUS SHIFT			#-
		PUSH_META CLEAR_META ALL
		POP_ALL_META
	endmacro

	macro LANG_4 SHIFT			#@
		PUSH_META CLEAR_META ALL
		POP_ALL_META
	endmacro

	macro LANG_2 SHIFT			#*
		PUSH_META CLEAR_META ALL
		POP_ALL_META
	endmacro

	macro EQUAL SHIFT			#=
		PUSH_META CLEAR_META ALL
		POP_ALL_META
	endmacro

endblock

macroblock
	macro LANG_1				#+
		PUSH_META ASSIGN_META LSHIFT
		PRESS EQUAL
		POP_META
	endmacro


	macro LANG_2				#*
		PUSH_META ASSIGN_META LSHIFT
		PRESS 8
		POP_META
	endmacro

	macro LANG_3 SHIFT			#[
		PUSH_META CLEAR_META ALL
		PRESS LEFT_BRACE
		POP_ALL_META
	endmacro

	macro SEMICOLON SHIFT			#]
		PUSH_META CLEAR_META ALL
		PRESS RIGHT_BRACE
		POP_ALL_META
	endmacro

	macro LANG_3				#:
		PUSH_META ASSIGN_META LSHIFT
		PRESS SEMICOLON
		POP_META
	endmacro

	macro LANG_4				#@
		PUSH_META ASSIGN_META LSHIFT
		PRESS 2
		POP_META
	endmacro

	macro LANG_5				#RESTORE
		PUSH_META ASSIGN_META LALT
		PRESS F4
		POP_META
	endmacro
endblock

macroblock
	macro F1 GUI				#F2
		PUSH_META CLEAR_META ALL
		PRESS F2
		POP_ALL_META
	endmacro

	macro F3 GUI				#F4
		PUSH_META CLEAR_META ALL
		PRESS F4
		POP_ALL_META
	endmacro

	macro F5 GUI				#F6
		PUSH_META CLEAR_META ALL
		PRESS F6
		POP_ALL_META
	endmacro

	macro F7 GUI				#F8
		PUSH_META CLEAR_META ALL
		PRESS F8
		POP_ALL_META
	endmacro

	macro W GUI				#WASD
		PUSH_META CLEAR_META ALL
		PRESS UP
		POP_ALL_META
	endmacro

	macro A GUI				#WASD
		PUSH_META CLEAR_META ALL
		PRESS LEFT
		POP_ALL_META
	endmacro

	macro S GUI				#WASD
		PUSH_META CLEAR_META ALL
		PRESS DOWN
		POP_ALL_META
	endmacro

	macro D GUI				#WASD
		PUSH_META CLEAR_META ALL
		PRESS RIGHT
		POP_ALL_META
	endmacro
endblock