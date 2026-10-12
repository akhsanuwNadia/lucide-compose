package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("KeyRound") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.586f,17.414f)
                curveTo(2.2109013f,17.788984f,2.0001135f,18.29761f,2.0f,18.828f)
                lineTo(2.0f,21.0f)
                curveTo(2.0f,21.552284f,2.4477153f,22.0f,3.0f,22.0f)
                lineTo(6.0f,22.0f)
                curveTo(6.5522847f,22.0f,7.0f,21.552284f,7.0f,21.0f)
                lineTo(7.0f,20.0f)
                curveTo(7.0f,19.447716f,7.4477153f,19.0f,8.0f,19.0f)
                lineTo(9.0f,19.0f)
                curveTo(9.552285f,19.0f,10.0f,18.552284f,10.0f,18.0f)
                lineTo(10.0f,17.0f)
                curveTo(10.0f,16.447716f,10.447715f,16.0f,11.0f,16.0f)
                lineTo(11.172f,16.0f)
                curveTo(11.70239f,15.9998865f,12.211015f,15.789099f,12.586f,15.414f)
                lineTo(13.400001f,14.599999f)
                curveTo(16.26221f,15.597042f,19.433619f,14.483585f,21.04436f,11.916124f)
                curveTo(22.655102f,9.348663f,22.2776f,6.0087376f,20.134432f,3.865569f)
                curveTo(17.991262f,1.7224003f,14.651337f,1.344899f,12.083876f,2.9556403f)
                curveTo(9.516415f,4.5663815f,8.402958f,7.7377887f,9.400001f,10.599999f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,7.5f)
                curveTo(15.999199f,7.6791654f,16.094322f,7.845065f,16.249352f,7.93488f)
                curveTo(16.404383f,8.024694f,16.595617f,8.024694f,16.750648f,7.93488f)
                curveTo(16.905678f,7.845065f,17.000801f,7.6791654f,17.0f,7.5f)
                curveTo(17.000801f,7.3208346f,16.905678f,7.154935f,16.750648f,7.06512f)
                curveTo(16.595617f,6.975305f,16.404383f,6.975305f,16.249352f,7.06512f)
                curveTo(16.094322f,7.154935f,15.999199f,7.3208346f,16.0f,7.5f)
            }
}

public val LucideIcons.All.KeyRoundDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.KeyRound: ImageVector
    @Composable get() = KeyRoundDefinition.asImageVector()
