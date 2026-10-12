package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Drumstick") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.4f,15.63f)
                curveTo(12.3274765f,16.615788f,9.499968f,15.581908f,8.432402f,13.082297f)
                curveTo(7.3648357f,10.582686f,8.307627f,7.2036605f,10.755642f,4.755645f)
                curveTo(13.203658f,2.3076286f,16.582684f,1.3648374f,19.082294f,2.4324026f)
                curveTo(21.581905f,3.4999676f,22.615786f,6.327477f,21.63f,9.4f)
                curveTo(20.197884f,8.583063f,18.091692f,9.077595f,16.584642f,10.584643f)
                curveTo(15.077595f,12.091692f,14.583063f,14.197885f,15.4f,15.629999f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.29f,12.71f)
                lineTo(5.69f,15.309999f)
                curveTo(4.8222723f,14.83194f,3.754109f,14.911379f,2.9666424f,15.512535f)
                curveTo(2.1791756f,16.113691f,1.8209847f,17.123138f,2.0534096f,18.086191f)
                curveTo(2.285834f,19.049244f,3.0650203f,19.784195f,4.04f,19.96f)
                curveTo(4.231224f,20.921833f,4.9671373f,21.683043f,5.921963f,21.906652f)
                curveTo(6.8767886f,22.13026f,7.874173f,21.77497f,8.472591f,20.99806f)
                curveTo(9.071009f,20.22115f,9.159933f,19.166113f,8.7f,18.3f)
                lineTo(11.29f,15.709999f)
            }
}

public val LucideIcons.All.DrumstickDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Drumstick: ImageVector
    @Composable get() = DrumstickDefinition.asImageVector()
