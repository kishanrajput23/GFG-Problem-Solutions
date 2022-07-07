int i=0;
        int j=n-1;
        while(i<j)
        {
            if(a[i]!=a[j])
            return false;
            i++;
            j--;
        }
        return true;
