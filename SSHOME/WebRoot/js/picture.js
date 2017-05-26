// JavaScript Document
 window.onload = function(){
	 var container=document.getElementById('container');
	 var tab=document.getElementById('tab'); 
	 var images = document.getElementById('tab').getElementsByTagName('img');
	 var pos = 0;
	 var len = images.length;
	 var buttons=document.getElementById('buttons').getElementsByTagName('span');
	 var prev=document.getElementById('prev');
	 var next=document.getElementById('next');
	 var timer;
	 
	  next.onclick=function(){
            images[pos].style.display = 'none';
            pos = ++pos == len ? 0 : pos;
            images[pos].style.display = 'inline';
			showButton(); 	
		}
		
		prev.onclick=function(){
		images[pos].style.display = 'none';
        pos = pos-- == 0 ? len-1 : pos;
        images[pos].style.display = 'inline'; 
		showButton();	
		}
		
	for(var i=0;i<buttons.length;i++){
			buttons[i].onclick=function(){
				if(this.className=='on'){
					return;
					}
				showButton();
				}
			}

	function showButton(){
		for(var i=0;i<buttons.length;i++){
			if(buttons[i].className=='on'){
				buttons[i].className='';
				break;
				}
			}
		buttons[pos].className='on';
		}
		
	
		function play(){
			timer=setInterval(function(){	
				next.onclick();
				},3000);
			}
			
			function stop(){
				clearInterval(timer);
				}
	
			container.onmouseover=stop;
			container.onmouseout=play;
		    play();
			
    
    };