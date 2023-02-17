package com.jeanbarrossilva.aurelius.core

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.compose.runtime.Composable
import com.jeanbarrossilva.aurelius.databinding.ActivityComposableBinding
import com.jeanbarrossilva.aurelius.ui.theme.AureliusTheme

/** [ComponentActivity] whose [content][Content] is a themed [Composable]. **/
abstract class ComposableActivity : ComponentActivity() {
    private var binding: ActivityComposableBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityComposableBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        setUpContent()
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }

    /**
     * [Composable] to be set as the content of this [ComposableActivity] and displayed.
     *
     * @see setContentView
     **/
    @Composable
    protected abstract fun Content()

    private fun setUpContent() {
        binding?.root?.setContent {
            ThemedContent()
        }
    }

    @Composable
    private fun ThemedContent() {
        AureliusTheme {
            Content()
        }
    }
}
