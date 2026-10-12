package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("HeartOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.5f,4.893f)
                curveTo(10.902744f,5.154383f,11.269528f,5.467377f,11.591f,5.8240004f)
                curveTo(11.69689f,5.937222f,11.844977f,6.0014834f,12.0f,6.0014834f)
                curveTo(12.155022f,6.0014834f,12.303109f,5.937222f,12.408999f,5.8240004f)
                curveTo(13.927117f,4.118203f,16.342613f,3.5302382f,18.474874f,4.3474827f)
                curveTo(20.607136f,5.1647267f,22.010878f,7.216514f,22.0f,9.5f)
                curveTo(22.0f,11.372f,20.998f,12.856f,19.813f,14.155001f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.967f,16.967f)
                lineTo(13.507999f,20.313f)
                curveTo(13.131066f,20.745916f,12.586293f,20.99601f,12.012288f,20.999643f)
                curveTo(11.438282f,21.003279f,10.890385f,20.760107f,10.507999f,20.331999f)
                lineTo(5.0f,15.0f)
                curveTo(3.5f,13.5f,2.0f,11.8f,2.0f,9.5f)
                curveTo(2.000145f,7.5364223f,3.0471103f,5.72186f,4.7469997f,4.739f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,2.0f)
                lineTo(22.0f,22.0f)
            }
}

public val LucideIcons.All.HeartOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.HeartOff: ImageVector
    @Composable get() = HeartOffDefinition.asImageVector()
