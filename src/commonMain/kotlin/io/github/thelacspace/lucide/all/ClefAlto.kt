package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ClefAlto") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,4.0f)
                lineTo(10.0f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,4.764f)
                curveTo(15.223084f,3.6704195f,17.097803f,3.762229f,18.208181f,4.9700847f)
                curveTo(19.31856f,6.17794f,19.252665f,8.053749f,18.060268f,9.180712f)
                curveTo(16.867872f,10.307674f,14.991332f,10.267709f,13.848f,9.091f)
                curveTo(13.360095f,10.812011f,11.788835f,11.999847f,10.0f,12.0f)
                curveTo(11.788835f,12.000153f,13.360095f,13.187989f,13.848f,14.909f)
                curveTo(14.991332f,13.732291f,16.867872f,13.692326f,18.060268f,14.819288f)
                curveTo(19.252665f,15.946251f,19.31856f,17.82206f,18.208181f,19.029915f)
                curveTo(17.097803f,20.237772f,15.223084f,20.32958f,14.0f,19.236f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,4.0f)
                lineTo(6.0f,20.0f)
            }
}

public val LucideIcons.All.ClefAltoDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ClefAlto: ImageVector
    @Composable get() = ClefAltoDefinition.asImageVector()
