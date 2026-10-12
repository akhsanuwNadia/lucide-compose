package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("WifiHigh") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,20.0)
                lineTo(12.010000228881836,20.0)
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

public val LucideIcons.All.WifiHighDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.WifiHigh: ImageVector
    @Composable get() = WifiHighDefinition.asImageVector()
