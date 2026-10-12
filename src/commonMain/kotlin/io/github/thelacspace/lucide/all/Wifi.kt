package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Wifi") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,20.0)
                lineTo(12.010000228881836,20.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,8.819999694824219)
                curveTo(7.6940131187438965,3.7271194458007812,16.305986404418945,3.7271194458007812,22.0,8.819999694824219)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,12.859000205993652)
                curveTo(8.888435363769531,9.047571182250977,15.111564636230469,9.047571182250977,19.0,12.859000205993652)
            }
            lucidePath(strokeWidth) {
                moveTo(8.5,16.429000854492188)
                curveTo(10.444217681884766,14.523286819458008,13.555782318115234,14.523286819458008,15.5,16.429000854492188)
            }
}

public val LucideIcons.All.WifiDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Wifi: ImageVector
    @Composable get() = WifiDefinition.asImageVector()
