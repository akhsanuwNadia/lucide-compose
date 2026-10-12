package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Sigma") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18.0,7.0)
                lineTo(18.0,5.0)
                curveTo(18.0,4.4477152824401855,17.552284240722656,4.0,17.0,4.0)
                lineTo(6.5,4.0)
                curveTo(6.310614109039307,4.0,6.137482166290283,4.107001304626465,6.052786350250244,4.276393413543701)
                curveTo(5.968090057373047,4.4457855224609375,5.986368179321289,4.648491382598877,6.099999904632568,4.800000190734863)
                lineTo(10.600000381469727,10.800000190734863)
                curveTo(11.133334159851074,11.51111125946045,11.133334159851074,12.488889694213867,10.600000381469727,13.200000762939453)
                lineTo(6.100000381469727,19.200000762939453)
                curveTo(5.9863691329956055,19.35150909423828,5.9680914878845215,19.554214477539062,6.0527873039245605,19.72360610961914)
                curveTo(6.137483596801758,19.89299964904785,6.310614585876465,20.0,6.500000476837158,20.0)
                lineTo(17.0,20.0)
                curveTo(17.552284240722656,20.0,18.0,19.552284240722656,18.0,19.0)
                lineTo(18.0,17.0)
            }
}

public val LucideIcons.All.SigmaDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Sigma: ImageVector
    @Composable get() = SigmaDefinition.asImageVector()
