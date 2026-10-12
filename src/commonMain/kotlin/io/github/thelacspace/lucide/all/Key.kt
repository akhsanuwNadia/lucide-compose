package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Key") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0f,21.0f)
                lineTo(11.6f,11.4f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.5f,15.5f)
                lineTo(9.8f,17.8f)
                curveTo(10.181143f,18.188843f,10.181143f,18.811155f,9.8f,19.199999f)
                lineTo(7.7000003f,21.3f)
                curveTo(7.3111567f,21.681143f,6.6888437f,21.681143f,6.3f,21.3f)
                lineTo(4.0f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,7.5f)
                curveTo(9.991186f,9.47082f,11.037548f,11.295716f,12.742875f,12.283679f)
                curveTo(14.448202f,13.271643f,16.551798f,13.271643f,18.257126f,12.283679f)
                curveTo(19.962452f,11.295716f,21.008814f,9.47082f,21.0f,7.5f)
                curveTo(21.008814f,5.5291796f,19.962452f,3.704284f,18.257126f,2.7163205f)
                curveTo(16.551798f,1.7283574f,14.448202f,1.7283574f,12.742875f,2.7163205f)
                curveTo(11.037548f,3.704284f,9.991186f,5.5291796f,10.0f,7.5f)
            }
}

public val LucideIcons.All.KeyDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Key: ImageVector
    @Composable get() = KeyDefinition.asImageVector()
