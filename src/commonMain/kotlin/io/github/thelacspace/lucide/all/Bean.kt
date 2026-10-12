package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Bean") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.164999961853027,6.5980000495910645)
                curveTo(9.954000473022461,7.478000164031982,9.640000343322754,8.359999656677246,9.0,9.0)
                curveTo(8.359999656677246,9.640000343322754,7.479000091552734,9.954000473022461,6.5980000495910645,10.164999961853027)
                curveTo(3.639238119125366,10.873586654663086,1.6791616678237915,13.684536933898926,2.037071704864502,16.705839157104492)
                curveTo(2.394981861114502,19.727142333984375,4.957572937011719,22.00232696533203,8.0,22.0)
                curveTo(15.732000350952148,22.0,22.0,15.732000350952148,22.0,8.0)
                curveTo(22.00232696533203,4.957572937011719,19.727142333984375,2.394981861114502,16.705839157104492,2.037071704864502)
                curveTo(13.684536933898926,1.6791616678237915,10.873586654663086,3.639238119125366,10.164999961853027,6.5980000495910645)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(5.341000080108643,10.619999885559082)
                curveTo(6.065993309020996,12.25146770477295,7.784370422363281,13.204968452453613,9.552340507507324,12.956808090209961)
                curveTo(11.320310592651367,12.708647727966309,12.7097806930542,11.318914413452148,12.957606315612793,9.550897598266602)
                curveTo(13.205431938171387,7.7828803062438965,12.251605033874512,6.06468391418457,10.619999885559082,5.339999675750732)
            }
}

public val LucideIcons.All.BeanDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Bean: ImageVector
    @Composable get() = BeanDefinition.asImageVector()
