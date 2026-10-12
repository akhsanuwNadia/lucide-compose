package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Ham") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.144f,21.144f)
                curveTo(15.799039f,18.505447f,17.271225f,15.075993f,17.003107f,12.154221f)
                curveTo(16.734987f,9.232449f,14.76755f,7.2650123f,11.845778f,6.9968934f)
                curveTo(8.924006f,6.7287745f,5.494552f,8.200961f,2.856f,10.856f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.144f,21.144f)
                curveTo(14.830752f,19.431917f,13.905051f,15.75895f,11.07305f,12.9269495f)
                curveTo(8.241048f,10.094948f,4.568082f,9.169248f,2.856f,10.856f)
                curveTo(1.1692473f,12.568082f,2.0949478f,16.241049f,4.926949f,19.07305f)
                curveTo(7.7589507f,21.905052f,11.431917f,22.830753f,13.144f,21.144001f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.565f,10.435f)
                lineTo(18.6f,8.4f)
                curveTo(19.468197f,8.881058f,20.53871f,8.80318f,21.32814f,8.201531f)
                curveTo(22.11757f,7.5998836f,22.476507f,6.5883355f,22.242867f,5.623663f)
                curveTo(22.009228f,4.65899f,21.227234f,3.9237704f,20.25f,3.7499995f)
                curveTo(20.058775f,2.7881646f,19.322863f,2.0269554f,18.368036f,1.8033464f)
                curveTo(17.413212f,1.5797375f,16.415827f,1.935029f,15.817409f,2.711939f)
                curveTo(15.218991f,3.4888494f,15.130067f,4.543885f,15.59f,5.4099994f)
                lineTo(13.566f,7.4349995f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.5f,16.5f)
                lineTo(7.5f,15.5f)
            }
}

public val LucideIcons.All.HamDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Ham: ImageVector
    @Composable get() = HamDefinition.asImageVector()
