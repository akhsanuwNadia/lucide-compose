package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PaperBag") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.364f,3.848f)
                curveTo(4.0f,6.0f,3.0f,9.652f,3.0f,12.652f)
                lineTo(3.0f,19.0f)
                curveTo(3.0f,20.10457f,3.8954306f,21.0f,5.0f,21.0f)
                lineTo(19.0f,21.0f)
                curveTo(20.10457f,21.0f,21.0f,20.10457f,21.0f,19.0f)
                lineTo(21.0f,14.0f)
                curveTo(21.0f,11.666f,19.184f,9.332f,18.378f,6.998f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,3.0f)
                lineTo(18.379f,3.0f)
                curveTo(19.136692f,3.000026f,19.829311f,3.428219f,20.168f,4.106f)
                lineTo(20.890999f,5.553f)
                curveTo(21.045858f,5.862902f,21.029284f,6.230879f,20.847193f,6.525605f)
                curveTo(20.665104f,6.8203316f,20.34344f,6.9998145f,19.997f,7.0f)
                lineTo(11.472f,7.0f)
                curveTo(10.714309f,6.9999743f,10.021688f,6.5717807f,9.683001f,5.894f)
                lineTo(8.79f,4.105f)
                curveTo(8.472341f,3.4623334f,7.835098f,3.0387552f,7.119568f,2.9946558f)
                curveTo(6.404038f,2.9505568f,5.719604f,3.292678f,5.3254313f,3.8914735f)
                curveTo(4.931259f,4.4902687f,4.887605f,5.2542005f,5.211f,5.894f)
                lineTo(7.472f,10.416f)
                curveTo(7.8191752f,11.110246f,7.999947f,11.875787f,8.0f,12.652f)
                lineTo(8.0f,21.0f)
            }
}

public val LucideIcons.All.PaperBagDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PaperBag: ImageVector
    @Composable get() = PaperBagDefinition.asImageVector()
