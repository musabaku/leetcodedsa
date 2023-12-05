public void Reverse(){
        if(size<2){
            return;
        }
        Node previous = null;
        Node present = head;
        Node future = present.next;
        while(present!=null) {
            present.next = previous;
            previous = present;
            present = future;
            if (future != null){
                future = future.next;
        }
        }
        head = previous;
    }