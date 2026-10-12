package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Shell") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.0f,11.0f)
                curveTo(14.003205f,11.716661f,13.622709f,12.38026f,13.002591f,12.73952f)
                curveTo(12.382472f,13.098779f,11.617528f,13.098779f,10.997409f,12.73952f)
                curveTo(10.377291f,12.38026f,9.996795f,11.716661f,10.0f,11.0f)
                curveTo(10.009849f,8.797844f,11.797822f,7.0178485f,14.0f,7.0178485f)
                curveTo(16.202179f,7.0178485f,17.990152f,8.797844f,18.0f,11.0f)
                curveTo(17.985228f,14.303234f,15.3032675f,16.973227f,12.0f,16.973227f)
                curveTo(8.6967325f,16.973227f,6.0147724f,14.303234f,6.0f,11.0f)
                curveTo(6.0196967f,6.5956874f,9.595643f,3.0356972f,14.0f,3.0356972f)
                curveTo(18.404356f,3.0356972f,21.980303f,6.5956874f,22.0f,11.0f)
                curveTo(22.016026f,14.583309f,20.113548f,17.901302f,17.012955f,19.6976f)
                curveTo(13.91236f,21.493896f,10.08764f,21.493896f,6.987046f,19.6976f)
                curveTo(3.8864517f,17.901302f,1.9839749f,14.583309f,2.0f,11.0f)
                curveTo(1.9963136f,8.393595f,2.8462965f,5.8576956f,4.42f,3.7800002f)
                curveTo(4.837537f,3.164213f,5.5623803f,2.83109f,6.301601f,2.915255f)
                curveTo(7.0408216f,2.9994202f,7.672227f,3.486961f,7.9406486f,4.180849f)
                curveTo(8.20907f,4.874737f,8.070139f,5.660273f,7.58f,6.2200003f)
            }
}

public val LucideIcons.All.ShellDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Shell: ImageVector
    @Composable get() = ShellDefinition.asImageVector()
