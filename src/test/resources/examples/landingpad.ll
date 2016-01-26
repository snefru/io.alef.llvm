define void @landingpad() {
    landingpad { i8*, i32 } cleanup
    landingpad { i8*, i32 }
          catch i8* bitcast ({ i8*, i8* }* @_ZTI13ParseErrorMsg to i8*)}
    landingpad { i8*, i32 } catch i8* bitcast (i8** @_ZTIPKc to i8*)