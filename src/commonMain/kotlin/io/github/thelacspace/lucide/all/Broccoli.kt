package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Broccoli") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,13.0f)
                curveTo(8.786813f,12.999741f,7.6931977f,12.268818f,7.228966f,11.147964f)
                curveTo(6.7647343f,10.02711f,7.021276f,8.736983f,7.8789997f,7.879f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.606f,14.204f)
                curveTo(12.106f,15.704f,9.707f,18.707f,6.707f,21.707f)
                curveTo(6.519507f,21.89455f,6.2651944f,21.999943f,6.0f,22.0f)
                curveTo(4.0f,22.0f,2.0f,20.0f,2.0f,18.0f)
                curveTo(2.0000565f,17.734804f,2.1054504f,17.480492f,2.293f,17.293f)
                curveTo(4.204f,15.381999f,6.116f,13.714999f,7.6400003f,11.851999f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.573f,14.737f)
                curveTo(15.023489f,14.145277f,13.999917f,12.65865f,14.0f,11.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.14f,10.907f)
                curveTo(5.6161566f,10.569662f,4.4276876f,9.376814f,4.0959573f,7.8517404f)
                curveTo(3.7642267f,6.326667f,4.3498263f,4.7479267f,5.5958624f,3.8080919f)
                curveTo(6.841898f,2.868257f,8.520778f,2.7389905f,9.896f,3.4769998f)
                curveTo(10.786062f,2.3819273f,12.187286f,1.8368744f,13.583366f,2.0426753f)
                curveTo(14.979447f,2.248476f,16.16379f,3.1746757f,16.7f,4.48f)
                curveTo(17.49352f,3.800447f,18.67639f,3.846136f,19.415127f,4.584874f)
                curveTo(20.153864f,5.323612f,20.199554f,6.5064797f,19.52f,7.3f)
                curveTo(20.825619f,7.83627f,21.75196f,9.020945f,21.957573f,10.41735f)
                curveTo(22.163187f,11.813755f,21.617632f,13.215158f,20.522001f,14.105f)
                curveTo(21.330269f,15.605847f,21.098562f,17.454035f,19.944813f,18.708906f)
                curveTo(18.791065f,19.96378f,16.968803f,20.349585f,15.405488f,19.669962f)
                curveTo(13.842173f,18.990341f,12.881333f,17.394636f,13.012001f,15.695f)
            }
}

public val LucideIcons.All.BroccoliDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Broccoli: ImageVector
    @Composable get() = BroccoliDefinition.asImageVector()
