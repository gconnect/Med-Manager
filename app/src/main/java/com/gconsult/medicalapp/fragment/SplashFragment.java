package com.gconsult.medicalapp.fragment;

/**
 * Created by Gconsult on 4/11/2018.
 */

public class SplashFragment extends Fragment {

    public SplashFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        SplashTask splashTask = new SplashTask();
        splashTask.execute();

        return inflater.inflate(R.layout.fragment_splash, container, false);
    }

    class SplashTask extends AsyncTask<Void, Void, Void> {

        @Override
        protected Void doInBackground(Void... params) {
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //Saves the missions when users restart
            if (getActivity() != null) {
                // Allows to apply to the FragmentManager
                getActivity().getFragmentManager().popBackStack();
            }

            return null;
        }
    }
}