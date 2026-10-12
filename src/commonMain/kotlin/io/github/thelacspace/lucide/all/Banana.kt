package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Banana") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0,13.0)
                curveTo(7.5,11.0,12.0,11.0,14.0,15.0)
                curveTo(15.721142768859863,14.121268272399902,17.777185440063477,14.210295677185059,19.415931701660156,15.23451042175293)
                curveTo(21.054676055908203,16.258726119995117,22.035663604736328,18.067842483520508,22.0,20.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.150000095367432,17.889999389648438)
                curveTo(10.670000076293945,16.369998931884766,13.799999237060547,11.0,12.149999618530273,5.8899993896484375)
                curveTo(11.550000190734863,4.0,11.5,2.0,13.0,2.0)
                curveTo(16.219999313354492,2.0,18.0,7.5,18.0,10.0)
                curveTo(18.0,16.5,13.800000190734863,22.0,7.510000228881836,22.0)
                curveTo(5.110000133514404,22.0,2.0,22.0,2.0,20.0)
                curveTo(2.0,18.5,3.1399998664855957,18.450000762939453,5.150000095367432,17.889999389648438)
                close()
            }
}

public val LucideIcons.All.BananaDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Banana: ImageVector
    @Composable get() = BananaDefinition.asImageVector()
