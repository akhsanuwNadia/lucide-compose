package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PhoneOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.1f,13.9f)
                curveTo(11.188836f,14.98849f,12.449761f,15.889923f,13.832001f,16.567999f)
                curveTo(14.257414f,16.76337f,14.761432f,16.63747f,15.045001f,16.265f)
                lineTo(15.400001f,15.799999f)
                curveTo(15.777709f,15.296388f,16.370485f,15.0f,17.0f,15.0f)
                lineTo(20.0f,15.0f)
                curveTo(21.10457f,15.0f,22.0f,15.895431f,22.0f,17.0f)
                lineTo(22.0f,20.0f)
                curveTo(22.0f,21.10457f,21.10457f,22.0f,20.0f,22.0f)
                curveTo(15.226088f,22.000042f,10.647687f,20.103645f,7.2720003f,16.728f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,2.0f)
                lineTo(2.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.76f,13.582f)
                curveTo(2.9560041f,10.711646f,1.9992893f,7.3901815f,2.0f,4.0f)
                curveTo(2.0f,2.8954306f,2.8954306f,2.0f,4.0f,2.0f)
                lineTo(7.0f,2.0f)
                curveTo(8.104569f,2.0f,9.0f,2.8954306f,9.0f,4.0f)
                lineTo(9.0f,7.0f)
                curveTo(9.0f,7.6295147f,8.703611f,8.222292f,8.2f,8.6f)
                lineTo(7.732f,8.951f)
                curveTo(7.353473f,9.240028f,7.2313027f,9.755904f,7.44f,10.184f)
                curveTo(7.5183287f,10.343199f,7.5996766f,10.500894f,7.684f,10.657f)
            }
}

public val LucideIcons.All.PhoneOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PhoneOff: ImageVector
    @Composable get() = PhoneOffDefinition.asImageVector()
