package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Signature") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21.0f,17.0f)
                lineTo(18.844f,15.132f)
                curveTo(18.698322f,14.993872f,18.484156f,14.956265f,18.300135f,15.036503f)
                curveTo(18.116112f,15.116739f,17.997925f,15.299258f,18.0f,15.5f)
                lineTo(18.0f,16.0f)
                curveTo(18.0f,16.552284f,17.552284f,17.0f,17.0f,17.0f)
                lineTo(15.0f,17.0f)
                curveTo(14.447715f,17.0f,14.0f,16.552284f,14.0f,16.0f)
                curveTo(14.0f,13.455f,10.009f,12.03f,5.5f,12.0f)
                curveTo(4.1236525f,12.006155f,3.0111554f,13.123638f,3.0111554f,14.5f)
                curveTo(3.0111554f,15.876362f,4.1236525f,16.993845f,5.5f,17.0f)
                curveTo(9.653f,17.0f,10.245f,5.705f,11.208f,3.5f)
                curveTo(11.65538f,2.476391f,12.727558f,1.8738164f,13.834541f,2.0238569f)
                curveTo(14.9415245f,2.1738973f,15.81462f,3.040134f,15.973385f,4.1459f)
                curveTo(16.13215f,5.2516656f,15.538049f,6.3285613f,14.518f,6.784f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,21.0f)
                lineTo(21.0f,21.0f)
            }
}

public val LucideIcons.All.SignatureDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Signature: ImageVector
    @Composable get() = SignatureDefinition.asImageVector()
