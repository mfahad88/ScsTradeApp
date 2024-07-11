package com.example.scstradeapp.android.presenter.login

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.scstradeapp.android.databinding.FragmentLoginBinding
import com.example.scstradeapp.android.helper.Utils
import com.facebook.AccessToken
import com.facebook.CallbackManager
import com.facebook.FacebookCallback
import com.facebook.FacebookException
import com.facebook.login.LoginManager
import com.facebook.login.LoginResult
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LoginFragment : Fragment() {
    lateinit var binding: FragmentLoginBinding

    private lateinit var callbackManager: CallbackManager
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoginBinding.inflate(inflater,container,false)
        init()  // initialize everything
        facebookData()  //handle facebook response

        return binding.root
    }

    private fun facebookData() {
        LoginManager.getInstance().registerCallback(callbackManager, object :
            FacebookCallback<LoginResult> {
            override fun onSuccess(loginResult: LoginResult) {
                val accessToken: AccessToken = loginResult.accessToken
                Log.d("MainActivity", "Facebook Access Token: ${accessToken.token}")
                // Handle successful login
            }

            override fun onCancel() {
                Log.d("MainActivity", "Facebook login canceled.")
            }

            override fun onError(exception: FacebookException) {
                Log.e("MainActivity", "Facebook login error: ${exception.message}")
            }
        })
    }

    private fun init() {
        callbackManager = CallbackManager.Factory.create()
        Utils.fbHashkey(requireContext())
        Log.e("Dark mode", Utils.isDarkMode(requireContext()).toString())
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        callbackManager.onActivityResult(requestCode, resultCode, data)
    }
}