package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("GraduationCap") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21.42f,10.922f)
                curveTo(21.785915f,10.760575f,22.02046f,10.396656f,22.016325f,9.9967375f)
                curveTo(22.012192f,9.596819f,21.770176f,9.237825f,21.401001f,9.084f)
                lineTo(12.83f,5.18f)
                curveTo(12.302794f,4.9395237f,11.697206f,4.9395237f,11.17f,5.18f)
                lineTo(2.6f,9.08f)
                curveTo(2.2362056f,9.23933f,2.0011785f,9.598845f,2.0011785f,9.996f)
                curveTo(2.0011785f,10.393155f,2.2362056f,10.752669f,2.6f,10.912f)
                lineTo(11.17f,14.82f)
                curveTo(11.697206f,15.060476f,12.302794f,15.060476f,12.83f,14.82f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,10.0f)
                lineTo(22.0f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,12.5f)
                lineTo(6.0f,16.0f)
                curveTo(6.0147724f,17.651617f,8.6967325f,18.986614f,12.0f,18.986614f)
                curveTo(15.3032675f,18.986614f,17.985228f,17.651617f,18.0f,16.0f)
                lineTo(18.0f,12.5f)
            }
}

public val LucideIcons.All.GraduationCapDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.GraduationCap: ImageVector
    @Composable get() = GraduationCapDefinition.asImageVector()
