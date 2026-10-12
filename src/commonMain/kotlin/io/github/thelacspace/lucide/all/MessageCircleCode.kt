package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MessageCircleCode") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,9.0f)
                lineTo(7.0f,12.0f)
                lineTo(10.0f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,15.0f)
                lineTo(17.0f,12.0f)
                lineTo(14.0f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.992f,16.342f)
                curveTo(3.1390393f,16.712914f,3.1717756f,17.119331f,3.0860002f,17.508999f)
                lineTo(2.0210001f,20.799f)
                curveTo(1.9512304f,21.138227f,2.06195f,21.489405f,2.3136673f,21.727274f)
                curveTo(2.5653846f,21.965141f,2.9222586f,22.055834f,3.257f,21.967f)
                lineTo(6.67f,20.969f)
                curveTo(7.037716f,20.896063f,7.4185286f,20.92794f,7.769f,21.060999f)
                curveTo(12.177509f,23.119762f,17.427994f,21.706697f,20.207699f,17.713366f)
                curveTo(22.987404f,13.720034f,22.489471f,8.305572f,19.028067f,4.8861938f)
                curveTo(15.566662f,1.4668162f,10.146522f,1.0350591f,6.1874423f,3.8633363f)
                curveTo(2.2283628f,6.6916137f,0.8795385f,11.958967f,2.992f,16.342f)
            }
}

public val LucideIcons.All.MessageCircleCodeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MessageCircleCode: ImageVector
    @Composable get() = MessageCircleCodeDefinition.asImageVector()
