package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Speech") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(8.8f,20.0f)
                lineTo(8.8f,15.9f)
                lineTo(10.7f,16.1f)
                curveTo(11.843594f,16.03646f,12.766168f,15.141172f,12.864f,14.0f)
                lineTo(12.864f,8.3f)
                curveTo(12.864389f,5.30941f,10.447447f,2.881002f,7.4568887f,2.8672383f)
                curveTo(4.4663305f,2.8534746f,2.0271375f,5.259533f,2.0f,8.25f)
                curveTo(2.0f,11.05f,2.6560001f,11.304f,3.0f,12.8f)
                curveTo(3.2324836f,13.703471f,3.2424345f,14.649841f,3.029f,15.558001f)
                lineTo(2.0f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.8f,17.8f)
                curveTo(22.72736f,14.872308f,22.728703f,10.126348f,19.803f,7.1969995f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,15.0f)
                curveTo(17.660843f,14.339292f,18.030031f,13.4417515f,18.025337f,12.507284f)
                curveTo(18.020641f,11.572818f,17.64245f,10.679033f,16.975f,10.025f)
            }
}

public val LucideIcons.All.SpeechDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Speech: ImageVector
    @Composable get() = SpeechDefinition.asImageVector()
