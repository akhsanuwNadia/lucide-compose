package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ContactRound") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0f,2.0f)
                lineTo(16.0f,4.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.915f,21.0f)
                curveTo(17.924616f,18.850014f,16.78313f,16.859219f,14.922773f,15.781441f)
                curveTo(13.062417f,14.703663f,10.767585f,14.703663f,8.907228f,15.781441f)
                curveTo(7.046872f,16.859219f,5.905386f,18.850014f,5.915001f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,2.0f)
                lineTo(8.0f,4.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,11.0f)
                curveTo(7.99359f,12.433324f,8.7545805f,13.760521f,9.994819f,14.479039f)
                curveTo(11.235056f,15.197558f,12.764944f,15.197558f,14.005181f,14.479039f)
                curveTo(15.2454195f,13.760521f,16.00641f,12.433324f,16.0f,11.0f)
                curveTo(16.00641f,9.566676f,15.2454195f,8.239479f,14.005181f,7.5209603f)
                curveTo(12.764944f,6.8024416f,11.235056f,6.8024416f,9.994819f,7.5209603f)
                curveTo(8.7545805f,8.239479f,7.99359f,9.566676f,8.0f,11.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,3.0f)
                lineTo(19.0f,3.0f)
                lineTo(21.0f,3.0f)
                lineTo(21.0f,21.0f)
                lineTo(19.0f,21.0f)
                lineTo(5.0f,21.0f)
                lineTo(3.0f,21.0f)
                lineTo(3.0f,3.0f)
                lineTo(5.0f,3.0f)
                close()
            }
}

public val LucideIcons.All.ContactRoundDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ContactRound: ImageVector
    @Composable get() = ContactRoundDefinition.asImageVector()
